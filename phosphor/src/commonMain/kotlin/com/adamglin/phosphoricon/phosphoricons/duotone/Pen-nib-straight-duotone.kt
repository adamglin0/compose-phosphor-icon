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

public val DuotoneGroup.`Pen-nib-straight-duotone`: ImageVector
    get() {
        if (`_pen-nib-straight-duotone` != null) {
            return `_pen-nib-straight-duotone`!!
        }
        `_pen-nib-straight-duotone` = Builder(name = "Pen-nib-straight-duotone", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(215.17f, 127.43f)
                lineTo(184.0f, 72.0f)
                horizontalLineTo(72.0f)
                lineTo(40.83f, 127.43f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.73f, 8.29f)
                lineTo(128.0f, 248.0f)
                lineToRelative(86.43f, -112.28f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 215.17f, 127.43f)
                close()
                moveTo(128.0f, 152.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 128.0f, 152.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.33f, 123.89f)
                curveToRelative(-0.06f, -0.13f, -0.12f, -0.26f, -0.19f, -0.38f)
                lineTo(192.0f, 69.9f)
                lineTo(192.0f, 32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(80.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 64.0f, 32.0f)
                lineTo(64.0f, 69.92f)
                lineTo(33.86f, 123.51f)
                curveToRelative(-0.07f, 0.12f, -0.13f, 0.25f, -0.2f, 0.38f)
                arcToRelative(15.94f, 15.94f, 0.0f, false, false, 1.46f, 16.57f)
                lineToRelative(0.11f, 0.14f)
                lineToRelative(86.44f, 112.28f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 12.67f, 0.0f)
                lineTo(220.77f, 140.6f)
                lineToRelative(0.11f, -0.14f)
                arcTo(15.92f, 15.92f, 0.0f, false, false, 222.33f, 123.89f)
                close()
                moveTo(176.0f, 32.0f)
                lineTo(176.0f, 64.0f)
                lineTo(80.0f, 64.0f)
                lineTo(80.0f, 32.0f)
                close()
                moveTo(128.0f, 144.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 128.0f, 144.0f)
                close()
                moveTo(136.0f, 224.5f)
                lineTo(136.0f, 158.83f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -16.0f, 0.0f)
                verticalLineToRelative(65.66f)
                lineTo(48.0f, 131.0f)
                lineTo(76.69f, 80.0f)
                lineTo(179.32f, 80.0f)
                lineTo(208.0f, 131.0f)
                close()
            }
        }
        .build()
        return `_pen-nib-straight-duotone`!!
    }

private var `_pen-nib-straight-duotone`: ImageVector? = null
