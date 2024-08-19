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

public val RegularGroup.Visor: ImageVector
    get() {
        if (_visor != null) {
            return _visor!!
        }
        _visor = Builder(name = "Visor", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(183.05f, 56.0f)
                lineTo(72.0f, 56.0f)
                arcTo(72.0f, 72.0f, 0.0f, false, false, 0.08f, 131.4f)
                curveToRelative(1.69f, 36.69f, 31.76f, 66.79f, 68.45f, 68.52f)
                curveToRelative(15.85f, 0.74f, 32.0f, -5.9f, 49.38f, -20.3f)
                arcToRelative(15.88f, 15.88f, 0.0f, false, true, 20.24f, 0.0f)
                curveTo(148.72f, 188.39f, 165.0f, 200.0f, 184.0f, 200.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, false, 72.0f, -72.95f)
                curveTo(255.49f, 87.87f, 222.76f, 56.0f, 183.05f, 56.0f)
                close()
                moveTo(223.86f, 167.34f)
                arcTo(55.63f, 55.63f, 0.0f, false, true, 184.0f, 184.0f)
                curveToRelative(-13.88f, 0.0f, -27.0f, -9.51f, -35.65f, -16.67f)
                arcToRelative(31.91f, 31.91f, 0.0f, false, false, -40.65f, 0.0f)
                curveTo(93.52f, 179.0f, 80.94f, 184.49f, 69.28f, 183.94f)
                arcToRelative(56.36f, 56.36f, 0.0f, false, true, -53.22f, -53.28f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 72.0f, 72.0f)
                lineTo(183.05f, 72.0f)
                curveToRelative(31.0f, 0.0f, 56.55f, 24.79f, 56.95f, 55.25f)
                arcTo(55.66f, 55.66f, 0.0f, false, true, 223.86f, 167.34f)
                close()
                moveTo(184.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(80.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(96.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 184.0f, 96.0f)
                close()
            }
        }
        .build()
        return _visor!!
    }

private var _visor: ImageVector? = null
