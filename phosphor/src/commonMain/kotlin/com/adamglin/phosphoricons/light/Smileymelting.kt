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

public val LightGroup.Smileymelting: ImageVector
    get() {
        if (_smileymelting != null) {
            return _smileymelting!!
        }
        _smileymelting = Builder(name = "Smileymelting", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(174.0f, 140.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 174.0f, 140.0f)
                close()
                moveTo(126.0f, 92.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, -10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 126.0f, 92.0f)
                close()
                moveTo(199.62f, 55.37f)
                arcTo(102.0f, 102.0f, 0.0f, false, false, 52.0f, 196.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.94f, -8.0f)
                arcTo(90.09f, 90.09f, 0.0f, false, true, 126.72f, 38.0f)
                lineTo(128.0f, 38.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, false, true, 67.07f, 150.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.95f, 8.0f)
                arcToRelative(102.0f, 102.0f, 0.0f, false, false, -4.41f, -140.63f)
                close()
                moveTo(152.0f, 170.0f)
                lineTo(136.0f, 170.0f)
                curveToRelative(-22.65f, 0.0f, -50.0f, -18.73f, -50.0f, -42.0f)
                arcToRelative(43.15f, 43.15f, 0.0f, false, true, 0.58f, -7.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -11.83f, -2.0f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, false, -0.75f, 9.0f)
                curveToRelative(0.0f, 14.26f, 7.2f, 28.0f, 20.27f, 38.6f)
                curveToRelative(12.0f, 9.79f, 27.26f, 15.4f, 41.73f, 15.4f)
                horizontalLineToRelative(16.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.0f, 20.0f)
                lineTo(96.0f, 202.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 0.0f, 44.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.0f, -20.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 0.0f, -44.0f)
                close()
            }
        }
        .build()
        return _smileymelting!!
    }

private var _smileymelting: ImageVector? = null
