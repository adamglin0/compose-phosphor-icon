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

public val DuotoneGroup.`Barricade-duotone`: ImageVector
    get() {
        if (`_barricade-duotone` != null) {
            return `_barricade-duotone`!!
        }
        `_barricade-duotone` = Builder(name = "Barricade-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(232.0f, 80.0f)
                verticalLineToRelative(68.0f)
                lineTo(156.0f, 72.0f)
                horizontalLineToRelative(68.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 232.0f, 80.0f)
                close()
                moveTo(32.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(4.0f)
                lineToRelative(76.0f, 76.0f)
                horizontalLineToRelative(72.0f)
                lineTo(84.0f, 72.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 64.0f)
                lineTo(32.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 16.0f, 80.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(56.0f, 168.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(72.0f, 168.0f)
                lineTo(184.0f, 168.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(200.0f, 168.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(240.0f, 80.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 224.0f, 64.0f)
                close()
                moveTo(224.0f, 128.69f)
                lineTo(175.31f, 80.0f)
                lineTo(224.0f, 80.0f)
                close()
                moveTo(80.69f, 80.0f)
                lineToRelative(72.0f, 72.0f)
                lineTo(103.31f, 152.0f)
                lineTo(32.0f, 80.69f)
                lineTo(32.0f, 80.0f)
                close()
                moveTo(32.0f, 103.31f)
                lineTo(80.69f, 152.0f)
                lineTo(32.0f, 152.0f)
                close()
                moveTo(224.0f, 152.0f)
                lineTo(175.31f, 152.0f)
                lineToRelative(-72.0f, -72.0f)
                horizontalLineToRelative(49.38f)
                lineTo(224.0f, 151.32f)
                lineTo(224.0f, 152.0f)
                close()
            }
        }
        .build()
        return `_barricade-duotone`!!
    }

private var `_barricade-duotone`: ImageVector? = null
