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

public val RegularGroup.Campfire: ImageVector
    get() {
        if (_campfire != null) {
            return _campfire!!
        }
        _campfire = Builder(name = "Campfire", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(223.62f, 226.42f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.05f, 5.2f)
                lineTo(128.0f, 204.39f)
                lineTo(42.43f, 231.62f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -4.85f, -15.25f)
                lineToRelative(64.0f, -20.37f)
                lineToRelative(-64.0f, -20.38f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 4.85f, -15.24f)
                lineTo(128.0f, 187.6f)
                lineToRelative(85.57f, -27.22f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 4.85f, 15.24f)
                lineToRelative(-64.0f, 20.38f)
                lineToRelative(64.0f, 20.37f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 223.62f, 226.42f)
                close()
                moveTo(68.0f, 108.0f)
                curveToRelative(0.0f, -20.1f, 9.77f, -40.87f, 28.24f, -60.0f)
                arcToRelative(156.0f, 156.0f, 0.0f, false, true, 27.57f, -22.76f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.38f, 0.0f)
                curveTo(134.47f, 26.59f, 188.0f, 60.08f, 188.0f, 108.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, -120.0f, 0.0f)
                close()
                moveTo(128.0f, 152.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                curveToRelative(0.0f, -13.57f, -10.0f, -24.46f, -16.0f, -29.79f)
                curveToRelative(-6.0f, 5.33f, -16.0f, 16.22f, -16.0f, 29.79f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 128.0f, 152.0f)
                close()
                moveTo(84.0f, 108.0f)
                arcToRelative(43.83f, 43.83f, 0.0f, false, false, 12.09f, 30.24f)
                curveToRelative(0.0f, -0.74f, -0.09f, -1.49f, -0.09f, -2.24f)
                curveToRelative(0.0f, -28.0f, 26.44f, -45.91f, 27.56f, -46.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.88f, 0.0f)
                curveTo(133.56f, 90.09f, 160.0f, 108.0f, 160.0f, 136.0f)
                curveToRelative(0.0f, 0.75f, 0.0f, 1.5f, -0.09f, 2.24f)
                arcTo(43.83f, 43.83f, 0.0f, false, false, 172.0f, 108.0f)
                curveToRelative(0.0f, -32.0f, -32.26f, -58.0f, -44.0f, -66.34f)
                curveTo(116.27f, 50.0f, 84.0f, 76.0f, 84.0f, 108.0f)
                close()
            }
        }
        .build()
        return _campfire!!
    }

private var _campfire: ImageVector? = null
