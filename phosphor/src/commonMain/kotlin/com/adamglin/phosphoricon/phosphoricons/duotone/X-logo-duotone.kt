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

public val DuotoneGroup.`X-logo-duotone`: ImageVector
    get() {
        if (`_x-logo-duotone` != null) {
            return `_x-logo-duotone`!!
        }
        `_x-logo-duotone` = Builder(name = "X-logo-duotone", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(208.0f, 216.0f)
                horizontalLineTo(160.0f)
                lineTo(48.0f, 40.0f)
                horizontalLineTo(96.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(214.75f, 211.71f)
                lineToRelative(-62.6f, -98.38f)
                lineToRelative(61.77f, -67.95f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.84f, -10.76f)
                lineTo(143.24f, 99.34f)
                lineTo(102.75f, 35.71f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 96.0f, 32.0f)
                horizontalLineTo(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.75f, 12.3f)
                lineToRelative(62.6f, 98.37f)
                lineToRelative(-61.77f, 68.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, 10.76f)
                lineToRelative(58.84f, -64.72f)
                lineToRelative(40.49f, 63.63f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 160.0f, 224.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.75f, -12.29f)
                close()
                moveTo(164.39f, 208.0f)
                lineTo(62.57f, 48.0f)
                horizontalLineToRelative(29.0f)
                lineTo(193.43f, 208.0f)
                close()
            }
        }
        .build()
        return `_x-logo-duotone`!!
    }

private var `_x-logo-duotone`: ImageVector? = null
