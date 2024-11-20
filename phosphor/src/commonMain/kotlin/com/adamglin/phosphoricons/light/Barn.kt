package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Barn: ImageVector
    get() {
        if (_barn != null) {
            return _barn!!
        }
        _barn = Builder(name = "Barn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 194.0f)
                lineTo(230.0f, 194.0f)
                lineTo(230.0f, 124.32f)
                lineToRelative(5.12f, 7.17f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 9.76f, -7.0f)
                lineToRelative(-40.0f, -56.0f)
                arcToRelative(6.14f, 6.14f, 0.0f, false, false, -1.47f, -1.45f)
                lineTo(135.77f, 20.35f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -15.62f, 0.06f)
                lineTo(52.59f, 67.06f)
                arcToRelative(6.14f, 6.14f, 0.0f, false, false, -1.47f, 1.45f)
                lineToRelative(-40.0f, 56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 9.76f, 7.0f)
                lineTo(26.0f, 124.32f)
                lineTo(26.0f, 194.0f)
                lineTo(16.0f, 194.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(240.0f, 206.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(38.0f, 107.52f)
                lineTo(60.27f, 76.34f)
                lineToRelative(66.62f, -46.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.14f, -0.06f)
                lineToRelative(66.7f, 46.06f)
                lineTo(218.0f, 107.52f)
                lineTo(218.0f, 194.0f)
                lineTo(190.0f, 194.0f)
                lineTo(190.0f, 120.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                lineTo(72.0f, 114.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(74.0f)
                lineTo(38.0f, 194.0f)
                close()
                moveTo(128.0f, 152.63f)
                lineTo(90.72f, 126.0f)
                horizontalLineToRelative(74.56f)
                close()
                moveTo(178.0f, 131.63f)
                verticalLineToRelative(56.68f)
                lineTo(138.32f, 160.0f)
                close()
                moveTo(117.68f, 160.0f)
                lineTo(78.0f, 188.34f)
                lineTo(78.0f, 131.66f)
                close()
                moveTo(128.0f, 167.37f)
                lineTo(165.28f, 194.0f)
                lineTo(90.72f, 194.0f)
                close()
                moveTo(106.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(112.0f, 94.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 106.0f, 88.0f)
                close()
            }
        }
        .build()
        return _barn!!
    }

private var _barn: ImageVector? = null
