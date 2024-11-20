package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Radioactive: ImageVector
    get() {
        if (_radioactive != null) {
            return _radioactive!!
        }
        _radioactive = Builder(name = "Radioactive", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(92.0f, 136.0f)
                lineTo(40.0f, 136.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -11.76f, -5.21f)
                arcToRelative(16.21f, 16.21f, 0.0f, false, true, -4.17f, -12.37f)
                arcTo(103.83f, 103.83f, 0.0f, false, true, 67.65f, 42.93f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 90.75f, 48.0f)
                lineToRelative(26.0f, 45.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -13.86f, 8.0f)
                lineTo(76.89f, 56.0f)
                arcTo(87.83f, 87.83f, 0.0f, false, false, 40.0f, 119.86f)
                arcToRelative(0.19f, 0.19f, 0.0f, false, false, 0.07f, 0.16f)
                lineTo(92.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(231.93f, 118.42f)
                arcToRelative(103.83f, 103.83f, 0.0f, false, false, -43.58f, -75.49f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 165.25f, 48.0f)
                lineTo(139.3f, 93.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.86f, 8.0f)
                lineToRelative(26.0f, -45.0f)
                arcTo(87.87f, 87.87f, 0.0f, false, true, 216.0f, 119.86f)
                curveToRelative(0.0f, 0.07f, 0.0f, 0.12f, 0.0f, 0.14f)
                lineTo(164.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(52.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 11.76f, -5.21f)
                arcTo(16.21f, 16.21f, 0.0f, false, false, 231.93f, 118.42f)
                close()
                moveTo(152.93f, 155.18f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -13.86f, 8.0f)
                lineToRelative(25.84f, 44.73f)
                arcToRelative(88.22f, 88.22f, 0.0f, false, true, -73.81f, 0.0f)
                lineToRelative(25.83f, -44.73f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -13.86f, -8.0f)
                lineTo(77.25f, 199.91f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 7.12f, 22.52f)
                arcToRelative(104.24f, 104.24f, 0.0f, false, false, 87.26f, 0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 7.12f, -22.52f)
                close()
                moveTo(128.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 128.0f, 140.0f)
                close()
            }
        }
        .build()
        return _radioactive!!
    }

private var _radioactive: ImageVector? = null
