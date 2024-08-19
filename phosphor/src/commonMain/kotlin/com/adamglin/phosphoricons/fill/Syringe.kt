package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Syringe: ImageVector
    get() {
        if (_syringe != null) {
            return _syringe!!
        }
        _syringe = Builder(name = "Syringe", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.66f, 77.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 0.0f)
                lineTo(208.0f, 59.25f)
                lineTo(179.3f, 88.0f)
                lineToRelative(34.35f, 34.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 11.32f)
                lineTo(196.0f, 127.27f)
                lineToRelative(-84.0f, 84.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 100.65f, 216.0f)
                horizontalLineTo(51.26f)
                lineTo(29.6f, 237.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.72f, -0.43f)
                arcToRelative(8.21f, 8.21f, 0.0f, false, true, 0.61f, -11.1f)
                lineToRelative(21.45f, -21.46f)
                verticalLineTo(155.28f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 44.63f, 144.0f)
                lineToRelative(15.18f, -15.18f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 0.0f)
                lineTo(94.3f, 157.63f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.32f, -11.32f)
                lineTo(76.78f, 117.47f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.66f)
                lineToRelative(11.0f, -11.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 0.0f)
                lineToRelative(28.84f, 28.84f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.32f, -11.32f)
                lineTo(104.79f, 89.46f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.66f)
                lineToRelative(23.87f, -23.86f)
                lineToRelative(-6.35f, -6.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.18f, -11.49f)
                arcToRelative(8.22f, 8.22f, 0.0f, false, true, 11.37f, 0.41f)
                lineTo(168.0f, 76.63f)
                lineToRelative(28.69f, -28.7f)
                lineTo(178.33f, 29.58f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.17f, -11.49f)
                arcToRelative(8.23f, 8.23f, 0.0f, false, true, 11.38f, 0.41f)
                lineToRelative(47.78f, 47.78f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 237.66f, 77.6f)
                close()
            }
        }
        .build()
        return _syringe!!
    }

private var _syringe: ImageVector? = null
