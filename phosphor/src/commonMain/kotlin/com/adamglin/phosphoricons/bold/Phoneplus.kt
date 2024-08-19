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

public val BoldGroup.Phoneplus: ImageVector
    get() {
        if (_phoneplus != null) {
            return _phoneplus!!
        }
        _phoneplus = Builder(name = "Phoneplus", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 162.8f)
                lineToRelative(-47.09f, -21.1f)
                lineToRelative(-0.18f, -0.08f)
                arcToRelative(19.89f, 19.89f, 0.0f, false, false, -19.0f, 1.74f)
                arcToRelative(13.08f, 13.08f, 0.0f, false, false, -1.12f, 0.84f)
                lineToRelative(-22.31f, 19.0f)
                curveToRelative(-13.0f, -7.05f, -26.43f, -20.37f, -33.49f, -33.21f)
                lineToRelative(19.06f, -22.66f)
                arcToRelative(10.67f, 10.67f, 0.0f, false, false, 0.85f, -1.15f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 1.66f, -18.83f)
                arcToRelative(1.42f, 1.42f, 0.0f, false, true, -0.08f, -0.18f)
                lineTo(93.2f, 40.0f)
                arcTo(20.05f, 20.05f, 0.0f, false, false, 72.42f, 28.15f)
                arcTo(60.27f, 60.27f, 0.0f, false, false, 20.0f, 88.0f)
                curveToRelative(0.0f, 81.61f, 66.39f, 148.0f, 148.0f, 148.0f)
                arcToRelative(60.27f, 60.27f, 0.0f, false, false, 59.85f, -52.42f)
                arcTo(20.06f, 20.06f, 0.0f, false, false, 216.0f, 162.8f)
                close()
                moveTo(168.0f, 212.0f)
                arcTo(124.15f, 124.15f, 0.0f, false, true, 44.0f, 88.0f)
                arcTo(36.27f, 36.27f, 0.0f, false, true, 72.48f, 52.47f)
                lineToRelative(18.82f, 42.0f)
                lineToRelative(-19.16f, 22.8f)
                arcToRelative(10.75f, 10.75f, 0.0f, false, false, -0.86f, 1.15f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 70.0f, 138.08f)
                curveToRelative(9.42f, 19.28f, 28.83f, 38.56f, 48.31f, 48.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 138.0f, 184.63f)
                arcToRelative(11.63f, 11.63f, 0.0f, false, false, 1.11f, -0.85f)
                lineToRelative(22.43f, -19.07f)
                lineToRelative(42.0f, 18.81f)
                arcTo(36.29f, 36.29f, 0.0f, false, true, 168.0f, 212.0f)
                close()
                moveTo(132.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(20.0f)
                verticalLineTo(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineTo(68.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                horizontalLineTo(188.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                verticalLineTo(92.0f)
                horizontalLineTo(144.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 132.0f, 80.0f)
                close()
            }
        }
        .build()
        return _phoneplus!!
    }

private var _phoneplus: ImageVector? = null
