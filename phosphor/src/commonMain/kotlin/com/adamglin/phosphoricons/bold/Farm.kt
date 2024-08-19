package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Farm: ImageVector
    get() {
        if (_farm != null) {
            return _farm!!
        }
        _farm = Builder(name = "Farm", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(177.17f, 207.11f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 161.0f, 224.88f)
                arcTo(203.53f, 203.53f, 0.0f, false, false, 24.0f, 172.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                arcTo(227.45f, 227.45f, 0.0f, false, true, 177.17f, 207.11f)
                close()
                moveTo(102.43f, 205.11f)
                arcTo(186.47f, 186.47f, 0.0f, false, false, 24.0f, 188.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                arcToRelative(162.61f, 162.61f, 0.0f, false, true, 68.41f, 14.9f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 10.0f, -21.81f)
                close()
                moveTo(244.0f, 160.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                arcToRelative(205.19f, 205.19f, 0.0f, false, false, -31.38f, 2.4f)
                arcToRelative(270.0f, 270.0f, 0.0f, false, true, 32.59f, 34.09f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -18.72f, 15.0f)
                arcTo(243.0f, 243.0f, 0.0f, false, false, 24.0f, 132.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                arcToRelative(271.0f, 271.0f, 0.0f, false, true, 44.0f, 3.6f)
                lineTo(68.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 4.8f, -9.6f)
                lineToRelative(64.0f, -48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 14.4f, 0.0f)
                lineToRelative(64.0f, 48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 220.0f, 80.0f)
                verticalLineToRelative(28.28f)
                curveToRelative(4.0f, -0.17f, 8.0f, -0.28f, 12.0f, -0.28f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                arcToRelative(242.85f, 242.85f, 0.0f, false, false, -74.42f, 11.55f)
                quadToRelative(9.28f, 5.35f, 18.15f, 11.46f)
                arcTo(228.59f, 228.59f, 0.0f, false, true, 232.0f, 148.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 244.0f, 160.0f)
                close()
                moveTo(156.0f, 108.0f)
                lineTo(132.0f, 108.0f)
                verticalLineToRelative(19.3f)
                quadToRelative(11.83f, -4.77f, 24.0f, -8.39f)
                close()
                moveTo(92.0f, 116.69f)
                curveToRelative(5.39f, 1.4f, 10.72f, 3.0f, 16.0f, 4.72f)
                lineTo(108.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                verticalLineToRelative(17.0f)
                quadToRelative(8.0f, -1.56f, 16.0f, -2.65f)
                lineTo(196.0f, 86.0f)
                lineTo(144.0f, 47.0f)
                lineTo(92.0f, 86.0f)
                close()
            }
        }
        .build()
        return _farm!!
    }

private var _farm: ImageVector? = null
