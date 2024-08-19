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

public val FillGroup.Radioactive: ImageVector
    get() {
        if (_radioactive != null) {
            return _radioactive!!
        }
        _radioactive = Builder(name = "Radioactive", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(116.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 116.0f, 128.0f)
                close()
                moveTo(100.22f, 131.51f)
                arcTo(29.0f, 29.0f, 0.0f, false, true, 100.0f, 128.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 16.94f, -25.73f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.87f, -5.66f)
                lineTo(90.75f, 48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -23.1f, -5.07f)
                arcToRelative(103.83f, 103.83f, 0.0f, false, false, -43.58f, 75.49f)
                arcToRelative(16.21f, 16.21f, 0.0f, false, false, 4.17f, 12.37f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 136.0f)
                lineTo(96.26f, 136.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 100.22f, 131.51f)
                close()
                moveTo(231.93f, 118.42f)
                arcToRelative(103.83f, 103.83f, 0.0f, false, false, -43.58f, -75.49f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 165.25f, 48.0f)
                lineTo(137.19f, 96.61f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.87f, 5.66f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 156.0f, 128.0f)
                arcToRelative(29.0f, 29.0f, 0.0f, false, true, -0.22f, 3.51f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.49f)
                lineTo(216.0f, 136.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 11.76f, -5.21f)
                arcTo(16.21f, 16.21f, 0.0f, false, false, 231.93f, 118.42f)
                close()
                moveTo(150.8f, 151.48f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.91f, -1.15f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -33.78f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.91f, 1.15f)
                lineTo(77.25f, 199.91f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 7.12f, 22.52f)
                arcToRelative(104.24f, 104.24f, 0.0f, false, false, 87.26f, 0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 7.12f, -22.52f)
                close()
            }
        }
        .build()
        return _radioactive!!
    }

private var _radioactive: ImageVector? = null
