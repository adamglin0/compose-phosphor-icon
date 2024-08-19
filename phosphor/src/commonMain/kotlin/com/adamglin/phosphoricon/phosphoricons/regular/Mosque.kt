package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.Mosque: ImageVector
    get() {
        if (_mosque != null) {
            return _mosque!!
        }
        _mosque = Builder(name = "Mosque", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 128.0f)
                arcToRelative(23.84f, 23.84f, 0.0f, false, false, -8.0f, 1.38f)
                lineTo(216.0f, 128.0f)
                curveToRelative(0.0f, -41.78f, -31.07f, -62.46f, -53.76f, -77.56f)
                curveTo(148.16f, 41.06f, 136.0f, 33.0f, 136.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                curveToRelative(0.0f, 9.0f, -12.16f, 17.06f, -26.24f, 26.44f)
                curveTo(71.07f, 65.54f, 40.0f, 86.22f, 40.0f, 128.0f)
                verticalLineToRelative(1.38f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 8.0f, 152.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                lineTo(80.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(88.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(152.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(248.0f, 152.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 224.0f, 128.0f)
                close()
                moveTo(102.63f, 63.76f)
                curveToRelative(9.67f, -6.44f, 19.0f, -12.68f, 25.37f, -20.0f)
                curveToRelative(6.34f, 7.35f, 15.7f, 13.59f, 25.37f, 20.0f)
                curveToRelative(20.0f, 13.32f, 42.48f, 28.29f, 46.11f, 56.24f)
                horizontalLineToRelative(-143.0f)
                curveTo(60.15f, 92.05f, 82.6f, 77.08f, 102.63f, 63.76f)
                close()
                moveTo(24.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(48.0f)
                lineTo(24.0f, 200.0f)
                close()
                moveTo(160.0f, 152.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -24.0f, 24.0f)
                verticalLineToRelative(24.0f)
                lineTo(120.0f, 200.0f)
                lineTo(120.0f, 176.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -48.0f, 0.0f)
                verticalLineToRelative(24.0f)
                lineTo(56.0f, 200.0f)
                lineTo(56.0f, 136.0f)
                lineTo(200.0f, 136.0f)
                verticalLineToRelative(64.0f)
                lineTo(184.0f, 200.0f)
                lineTo(184.0f, 176.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 160.0f, 152.0f)
                close()
                moveTo(232.0f, 200.0f)
                lineTo(216.0f, 200.0f)
                lineTo(216.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
            }
        }
        .build()
        return _mosque!!
    }

private var _mosque: ImageVector? = null
