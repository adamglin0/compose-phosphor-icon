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

public val LightGroup.SneakerMove: ImageVector
    get() {
        if (_sneakerMove != null) {
            return _sneakerMove!!
        }
        _sneakerMove = Builder(name = "SneakerMove", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.26f, 168.42f)
                lineToRelative(-28.62f, -14.31f)
                arcTo(49.72f, 49.72f, 0.0f, false, true, 174.0f, 109.39f)
                lineTo(174.0f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                arcToRelative(50.06f, 50.06f, 0.0f, false, true, -50.0f, -50.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -9.62f, -4.78f)
                lineToRelative(-77.0f, 58.41f)
                lineToRelative(-0.15f, 0.11f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 30.1f, 98.53f)
                lineTo(143.82f, 212.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.24f, 1.76f)
                lineTo(224.0f, 214.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(238.0f, 180.94f)
                arcTo(13.94f, 13.94f, 0.0f, false, false, 230.26f, 168.42f)
                close()
                moveTo(226.0f, 200.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(150.54f, 202.0f)
                lineTo(38.59f, 90.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 38.0f, 88.52f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.69f, -1.41f)
                lineTo(53.05f, 76.22f)
                lineToRelative(40.0f, 40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.49f, -8.48f)
                lineTo(62.71f, 68.91f)
                lineTo(107.0f, 35.3f)
                arcToRelative(62.13f, 62.13f, 0.0f, false, false, 55.0f, 50.41f)
                verticalLineToRelative(23.68f)
                arcToRelative(61.65f, 61.65f, 0.0f, false, false, 34.27f, 55.45f)
                lineToRelative(28.62f, 14.32f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.11f, 1.78f)
                close()
                moveTo(70.8f, 182.0f)
                lineTo(32.0f, 182.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(70.8f, 170.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 0.0f, 12.0f)
                close()
                moveTo(108.8f, 208.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(48.0f, 214.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(54.8f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 108.8f, 208.0f)
                close()
            }
        }
        .build()
        return _sneakerMove!!
    }

private var _sneakerMove: ImageVector? = null
