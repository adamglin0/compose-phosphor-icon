package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Googledrivelogo: ImageVector
    get() {
        if (_googledrivelogo != null) {
            return _googledrivelogo!!
        }
        _googledrivelogo = Builder(name = "Googledrivelogo", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.19f, 145.86f)
                lineTo(165.74f, 33.64f)
                arcTo(11.94f, 11.94f, 0.0f, false, false, 155.56f, 28.0f)
                lineTo(100.43f, 28.0f)
                arcToRelative(11.93f, 11.93f, 0.0f, false, false, -10.17f, 5.64f)
                lineToRelative(0.0f, 0.0f)
                lineTo(21.83f, 145.82f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -0.25f, 12.32f)
                lineTo(48.91f, 206.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 59.32f, 212.0f)
                lineTo(196.67f, 212.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 207.09f, 206.0f)
                lineToRelative(27.32f, -47.81f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 234.19f, 145.86f)
                close()
                moveTo(226.13f, 148.0f)
                lineTo(170.26f, 148.0f)
                lineToRelative(-37.6f, -62.67f)
                lineToRelative(27.39f, -45.65f)
                close()
                moveTo(95.06f, 148.0f)
                lineTo(128.0f, 93.11f)
                lineTo(160.93f, 148.0f)
                close()
                moveTo(165.73f, 156.0f)
                lineTo(194.53f, 204.0f)
                lineTo(61.47f, 204.0f)
                lineToRelative(28.79f, -48.0f)
                close()
                moveTo(128.0f, 77.56f)
                lineTo(103.06f, 36.0f)
                horizontalLineToRelative(49.87f)
                close()
                moveTo(95.94f, 39.68f)
                lineToRelative(27.39f, 45.65f)
                lineTo(85.74f, 148.0f)
                lineTo(29.87f, 148.0f)
                close()
                moveTo(29.58f, 156.0f)
                lineTo(80.94f, 156.0f)
                lineTo(54.63f, 199.85f)
                close()
                moveTo(201.37f, 199.85f)
                lineTo(175.06f, 156.0f)
                horizontalLineToRelative(51.36f)
                close()
            }
        }
        .build()
        return _googledrivelogo!!
    }

private var _googledrivelogo: ImageVector? = null
