package com.adamglin.phosphoricon.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.DuotoneGroup

public val DuotoneGroup.`Stack-simple-duotone`: ImageVector
    get() {
        if (`_stack-simple-duotone` != null) {
            return `_stack-simple-duotone`!!
        }
        `_stack-simple-duotone` = Builder(name = "Stack-simple-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(240.0f, 104.0f)
                lineTo(128.0f, 168.0f)
                lineTo(16.0f, 104.0f)
                lineTo(128.0f, 40.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 111.0f)
                lineToRelative(112.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.94f, 0.0f)
                lineToRelative(112.0f, -64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -13.9f)
                lineToRelative(-112.0f, -64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.94f, 0.0f)
                lineToRelative(-112.0f, 64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 12.0f, 111.0f)
                close()
                moveTo(128.0f, 49.21f)
                lineTo(223.87f, 104.0f)
                lineTo(128.0f, 158.79f)
                lineTo(32.13f, 104.0f)
                close()
                moveTo(247.0f, 140.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 244.0f, 151.0f)
                lineTo(132.0f, 215.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.94f, 0.0f)
                lineTo(12.0f, 151.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 20.0f, 137.05f)
                lineToRelative(108.0f, 61.74f)
                lineToRelative(108.0f, -61.74f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 247.0f, 140.0f)
                close()
            }
        }
        .build()
        return `_stack-simple-duotone`!!
    }

private var `_stack-simple-duotone`: ImageVector? = null
