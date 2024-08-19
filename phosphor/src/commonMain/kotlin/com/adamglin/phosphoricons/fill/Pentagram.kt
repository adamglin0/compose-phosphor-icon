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

public val FillGroup.Pentagram: ImageVector
    get() {
        if (_pentagram != null) {
            return _pentagram!!
        }
        _pentagram = Builder(name = "Pentagram", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(60.18f, 129.52f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.15f, 2.0f)
                lineTo(22.66f, 109.0f)
                arcToRelative(15.78f, 15.78f, 0.0f, false, true, -5.82f, -18.0f)
                arcTo(16.33f, 16.33f, 0.0f, false, true, 32.43f, 80.0f)
                lineTo(70.74f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.81f, 5.24f)
                close()
                moveTo(53.18f, 203.0f)
                arcTo(15.75f, 15.75f, 0.0f, false, false, 59.0f, 220.88f)
                arcToRelative(15.74f, 15.74f, 0.0f, false, false, 18.77f, 0.0f)
                lineToRelative(32.05f, -23.06f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -6.5f)
                lineTo(71.38f, 163.72f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.14f, 2.0f)
                close()
                moveTo(143.23f, 19.26f)
                arcToRelative(15.93f, 15.93f, 0.0f, false, false, -30.45f, -0.05f)
                lineTo(100.0f, 58.76f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 103.76f, 64.0f)
                horizontalLineToRelative(48.48f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.81f, -5.23f)
                close()
                moveTo(160.0f, 80.0f)
                lineTo(96.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.8f, 2.77f)
                lineTo(73.0f, 141.77f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.47f, 4.48f)
                lineToRelative(51.17f, 36.82f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.68f, 0.0f)
                lineToRelative(51.17f, -36.82f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.47f, -4.48f)
                lineToRelative(-19.15f, -59.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 160.0f, 80.0f)
                close()
                moveTo(239.13f, 91.0f)
                arcToRelative(16.33f, 16.33f, 0.0f, false, false, -15.59f, -11.0f)
                lineTo(185.26f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.81f, 5.24f)
                lineToRelative(14.37f, 44.29f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.14f, 2.0f)
                lineToRelative(31.41f, -22.6f)
                arcTo(15.75f, 15.75f, 0.0f, false, false, 239.16f, 91.0f)
                close()
                moveTo(184.58f, 163.75f)
                lineTo(146.18f, 191.38f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 6.5f)
                lineToRelative(32.0f, 23.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 202.85f, 203.0f)
                lineToRelative(-12.09f, -37.27f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 184.61f, 163.72f)
                close()
            }
        }
        .build()
        return _pentagram!!
    }

private var _pentagram: ImageVector? = null
