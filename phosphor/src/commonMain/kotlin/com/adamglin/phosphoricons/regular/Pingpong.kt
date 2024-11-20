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

public val RegularGroup.PingPong: ImageVector
    get() {
        if (_pingPong != null) {
            return _pingPong!!
        }
        _pingPong = Builder(name = "PingPong", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 196.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -6.65f, -11.7f)
                lineToRelative(-38.0f, -27.15f)
                lineToRelative(17.0f, -16.95f)
                arcToRelative(39.67f, 39.67f, 0.0f, false, false, 11.0f, -35.79f)
                arcToRelative(99.52f, 99.52f, 0.0f, false, false, -35.4f, -57.89f)
                arcTo(101.93f, 101.93f, 0.0f, false, false, 122.58f, 24.0f)
                arcTo(100.29f, 100.29f, 0.0f, false, false, 24.0f, 122.58f)
                arcToRelative(102.12f, 102.12f, 0.0f, false, false, 22.55f, 65.28f)
                arcToRelative(99.52f, 99.52f, 0.0f, false, false, 57.89f, 35.4f)
                arcToRelative(39.68f, 39.68f, 0.0f, false, false, 35.79f, -11.0f)
                lineToRelative(16.95f, -17.0f)
                lineToRelative(27.15f, 38.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 196.0f, 240.0f)
                curveToRelative(0.44f, 0.0f, 0.88f, 0.05f, 1.32f, 0.05f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 11.31f, -4.69f)
                lineToRelative(26.64f, -26.64f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 240.0f, 196.0f)
                close()
                moveTo(59.0f, 177.83f)
                arcToRelative(86.09f, 86.09f, 0.0f, false, true, -19.0f, -55.0f)
                arcTo(84.27f, 84.27f, 0.0f, false, true, 122.8f, 40.0f)
                arcToRelative(86.28f, 86.28f, 0.0f, false, true, 55.0f, 19.0f)
                arcTo(85.08f, 85.08f, 0.0f, false, true, 196.58f, 80.1f)
                lineTo(80.1f, 196.58f)
                arcTo(85.08f, 85.08f, 0.0f, false, true, 59.0f, 177.83f)
                close()
                moveTo(197.35f, 224.0f)
                lineToRelative(-32.63f, -45.69f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.85f, -3.32f)
                quadToRelative(-0.33f, 0.0f, -0.66f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.66f, 2.34f)
                lineToRelative(-23.63f, 23.63f)
                arcToRelative(23.68f, 23.68f, 0.0f, false, true, -21.36f, 6.63f)
                arcToRelative(80.3f, 80.3f, 0.0f, false, true, -12.3f, -3.5f)
                lineToRelative(108.8f, -108.8f)
                arcToRelative(80.63f, 80.63f, 0.0f, false, true, 3.5f, 12.3f)
                arcToRelative(23.67f, 23.67f, 0.0f, false, true, -6.63f, 21.36f)
                lineTo(177.3f, 152.55f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.0f, 12.17f)
                lineTo(224.0f, 197.35f)
                close()
            }
        }
        .build()
        return _pingPong!!
    }

private var _pingPong: ImageVector? = null
