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

public val DuotoneGroup.`Aperture-duotone`: ImageVector
    get() {
        if (`_aperture-duotone` != null) {
            return `_aperture-duotone`!!
        }
        `_aperture-duotone` = Builder(name = "Aperture-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(195.88f, 60.12f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, false, 0.0f, 135.76f)
                arcTo(96.0f, 96.0f, 0.0f, false, false, 195.88f, 60.12f)
                close()
                moveTo(140.54f, 163.12f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-36.68f, -6.69f)
                horizontalLineToRelative(0.0f)
                lineTo(91.32f, 121.3f)
                lineToRelative(24.14f, -28.41f)
                horizontalLineToRelative(0.0f)
                lineToRelative(36.68f, 6.69f)
                lineToRelative(12.54f, 35.12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(201.54f, 54.46f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 54.46f, 201.54f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 201.54f, 54.46f)
                close()
                moveTo(190.23f, 65.78f)
                arcToRelative(88.18f, 88.18f, 0.0f, false, true, 11.0f, 13.48f)
                lineTo(167.55f, 119.0f)
                lineTo(139.63f, 40.78f)
                arcTo(87.34f, 87.34f, 0.0f, false, true, 190.23f, 65.78f)
                close()
                moveTo(155.59f, 133.0f)
                lineToRelative(-18.16f, 21.37f)
                lineToRelative(-27.59f, -5.0f)
                lineTo(100.41f, 123.0f)
                lineToRelative(18.16f, -21.37f)
                lineToRelative(27.59f, 5.0f)
                close()
                moveTo(65.77f, 65.78f)
                arcToRelative(87.34f, 87.34f, 0.0f, false, true, 56.66f, -25.59f)
                lineToRelative(17.51f, 49.0f)
                lineTo(58.3f, 74.32f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 65.77f, 65.78f)
                close()
                moveTo(46.65f, 161.54f)
                arcToRelative(88.41f, 88.41f, 0.0f, false, true, 2.53f, -72.62f)
                lineToRelative(51.21f, 9.35f)
                close()
                moveTo(65.77f, 190.22f)
                arcToRelative(88.18f, 88.18f, 0.0f, false, true, -11.0f, -13.48f)
                lineTo(88.45f, 137.0f)
                lineToRelative(27.92f, 78.18f)
                arcTo(87.34f, 87.34f, 0.0f, false, true, 65.77f, 190.22f)
                close()
                moveTo(190.23f, 190.22f)
                arcToRelative(87.34f, 87.34f, 0.0f, false, true, -56.66f, 25.59f)
                lineToRelative(-17.51f, -49.0f)
                lineToRelative(81.64f, 14.91f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 190.23f, 190.22f)
                close()
                moveTo(155.61f, 157.73f)
                lineTo(209.35f, 94.46f)
                arcToRelative(88.41f, 88.41f, 0.0f, false, true, -2.53f, 72.62f)
                close()
            }
        }
        .build()
        return `_aperture-duotone`!!
    }

private var `_aperture-duotone`: ImageVector? = null
