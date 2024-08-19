package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Umbrella-thin`: ImageVector
    get() {
        if (`_umbrella-thin` != null) {
            return `_umbrella-thin`!!
        }
        `_umbrella-thin` = Builder(name = "Umbrella-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 127.0f)
                arcTo(108.44f, 108.44f, 0.0f, false, false, 54.46f, 56.69f)
                arcTo(107.53f, 107.53f, 0.0f, false, false, 20.0f, 127.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 13.0f)
                horizontalLineToRelative(92.0f)
                verticalLineToRelative(60.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 56.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -40.0f, 0.0f)
                lineTo(132.0f, 140.0f)
                horizontalLineToRelative(92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -13.0f)
                close()
                moveTo(32.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.38f)
                arcToRelative(100.2f, 100.2f, 0.0f, false, true, 89.73f, -91.09f)
                curveTo(106.0f, 49.76f, 85.08f, 80.45f, 84.0f, 132.0f)
                close()
                moveTo(92.0f, 132.0f)
                curveToRelative(1.21f, -56.0f, 27.6f, -86.37f, 35.94f, -94.57f)
                curveTo(136.35f, 45.64f, 162.73f, 76.0f, 163.94f, 132.0f)
                close()
                moveTo(226.87f, 130.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.0f, 1.3f)
                lineTo(172.0f, 132.0f)
                curveToRelative(-1.0f, -51.55f, -22.0f, -82.24f, -33.7f, -95.47f)
                arcTo(100.2f, 100.2f, 0.0f, false, true, 228.0f, 127.62f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 226.93f, 130.7f)
                close()
            }
        }
        .build()
        return `_umbrella-thin`!!
    }

private var `_umbrella-thin`: ImageVector? = null
