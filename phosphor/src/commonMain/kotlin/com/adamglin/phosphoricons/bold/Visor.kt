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

public val BoldGroup.Visor: ImageVector
    get() {
        if (_visor != null) {
            return _visor!!
        }
        _visor = Builder(name = "Visor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.0f, 104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(80.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(96.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 188.0f, 104.0f)
                close()
                moveTo(255.91f, 131.63f)
                arcTo(76.29f, 76.29f, 0.0f, false, true, 182.43f, 204.0f)
                curveToRelative(-0.56f, 0.0f, -1.13f, 0.0f, -1.69f, 0.0f)
                curveToRelative(-14.44f, 0.0f, -29.37f, -5.78f, -45.58f, -17.64f)
                arcToRelative(12.08f, 12.08f, 0.0f, false, false, -14.32f, 0.0f)
                curveTo(104.0f, 198.68f, 88.56f, 204.44f, 73.57f, 204.0f)
                arcTo(76.29f, 76.29f, 0.0f, false, true, 0.09f, 131.63f)
                arcTo(76.0f, 76.0f, 0.0f, false, true, 76.0f, 52.0f)
                lineTo(180.0f, 52.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, true, 75.91f, 79.63f)
                close()
                moveTo(217.62f, 92.1f)
                arcTo(51.56f, 51.56f, 0.0f, false, false, 180.0f, 76.0f)
                lineTo(76.0f, 76.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, -51.94f, 54.51f)
                arcTo(52.19f, 52.19f, 0.0f, false, false, 74.32f, 180.0f)
                curveToRelative(9.42f, 0.29f, 20.0f, -4.0f, 32.35f, -13.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 42.66f, 0.0f)
                curveToRelative(12.36f, 9.0f, 22.91f, 13.29f, 32.35f, 13.0f)
                arcToRelative(52.19f, 52.19f, 0.0f, false, false, 50.26f, -49.48f)
                arcTo(51.63f, 51.63f, 0.0f, false, false, 217.62f, 92.1f)
                close()
            }
        }
        .build()
        return _visor!!
    }

private var _visor: ImageVector? = null
