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

public val LightGroup.Balloon: ImageVector
    get() {
        if (_balloon != null) {
            return _balloon!!
        }
        _balloon = Builder(name = "Balloon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 18.0f)
                arcToRelative(86.1f, 86.1f, 0.0f, false, false, -86.0f, 86.0f)
                curveToRelative(0.0f, 23.0f, 9.24f, 48.52f, 24.71f, 68.27f)
                curveToRelative(12.37f, 15.79f, 27.23f, 26.42f, 43.05f, 31.07f)
                lineToRelative(-11.27f, 26.3f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 104.0f, 238.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.51f, -8.36f)
                lineToRelative(-11.27f, -26.3f)
                curveToRelative(15.82f, -4.65f, 30.68f, -15.28f, 43.0f, -31.07f)
                curveTo(204.76f, 152.52f, 214.0f, 127.0f, 214.0f, 104.0f)
                arcTo(86.1f, 86.1f, 0.0f, false, false, 128.0f, 18.0f)
                close()
                moveTo(112.17f, 204.0f)
                lineToRelative(0.58f, 0.14f)
                arcToRelative(2.05f, 2.05f, 0.0f, false, true, -0.58f, -0.14f)
                close()
                moveTo(142.9f, 226.0f)
                lineTo(113.1f, 226.0f)
                lineToRelative(8.7f, -20.31f)
                arcToRelative(62.15f, 62.15f, 0.0f, false, false, 12.4f, 0.0f)
                close()
                moveTo(128.0f, 194.0f)
                curveToRelative(-33.52f, 0.0f, -74.0f, -40.15f, -74.0f, -90.0f)
                arcToRelative(74.0f, 74.0f, 0.0f, false, true, 148.0f, 0.0f)
                curveTo(202.0f, 153.85f, 161.52f, 194.0f, 128.0f, 194.0f)
                close()
                moveTo(177.0f, 101.92f)
                arcToRelative(6.74f, 6.74f, 0.0f, false, true, -1.0f, 0.08f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.91f, -5.0f)
                arcTo(43.29f, 43.29f, 0.0f, false, false, 135.0f, 61.92f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 2.0f, -11.84f)
                arcTo(55.48f, 55.48f, 0.0f, false, true, 181.92f, 95.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 177.0f, 101.92f)
                close()
            }
        }
        .build()
        return _balloon!!
    }

private var _balloon: ImageVector? = null
