package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Visor: ImageVector
    get() {
        if (_visor != null) {
            return _visor!!
        }
        _visor = Builder(name = "Visor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(183.05f, 60.0f)
                horizontalLineTo(72.0f)
                arcTo(68.0f, 68.0f, 0.0f, false, false, 4.07f, 131.21f)
                curveToRelative(1.6f, 34.66f, 30.0f, 63.08f, 64.65f, 64.71f)
                curveToRelative(14.77f, 0.72f, 30.0f, -5.64f, 46.63f, -19.38f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, 25.35f, 0.0f)
                curveTo(150.79f, 184.92f, 166.25f, 196.0f, 184.0f, 196.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, 68.0f, -68.9f)
                curveTo(251.51f, 90.1f, 220.58f, 60.0f, 183.05f, 60.0f)
                close()
                moveTo(226.7f, 170.15f)
                arcTo(59.57f, 59.57f, 0.0f, false, true, 184.0f, 188.0f)
                curveToRelative(-15.17f, 0.0f, -29.07f, -10.0f, -38.2f, -17.58f)
                arcToRelative(27.88f, 27.88f, 0.0f, false, false, -35.55f, 0.0f)
                curveToRelative(-15.0f, 12.41f, -28.45f, 18.14f, -41.15f, 17.55f)
                arcToRelative(60.37f, 60.37f, 0.0f, false, true, -57.0f, -57.09f)
                arcTo(60.0f, 60.0f, 0.0f, false, true, 72.0f, 68.0f)
                horizontalLineTo(183.05f)
                curveToRelative(33.18f, 0.0f, 60.52f, 26.56f, 60.94f, 59.2f)
                arcTo(59.59f, 59.59f, 0.0f, false, true, 226.7f, 170.15f)
                close()
                moveTo(180.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineTo(80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(96.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 180.0f, 96.0f)
                close()
            }
        }
        .build()
        return _visor!!
    }

private var _visor: ImageVector? = null
