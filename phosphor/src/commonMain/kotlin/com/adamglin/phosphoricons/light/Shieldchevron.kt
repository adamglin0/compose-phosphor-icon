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

public val LightGroup.Shieldchevron: ImageVector
    get() {
        if (_shieldchevron != null) {
            return _shieldchevron!!
        }
        _shieldchevron = Builder(name = "Shieldchevron", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 42.0f)
                horizontalLineTo(48.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 34.0f, 56.0f)
                verticalLineToRelative(56.0f)
                curveToRelative(0.0f, 51.94f, 25.12f, 83.4f, 46.2f, 100.64f)
                curveToRelative(22.73f, 18.6f, 45.27f, 24.89f, 46.22f, 25.15f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.16f, 0.0f)
                curveToRelative(0.95f, -0.26f, 23.49f, -6.55f, 46.22f, -25.15f)
                curveTo(196.88f, 195.4f, 222.0f, 163.94f, 222.0f, 112.0f)
                verticalLineTo(56.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 208.0f, 42.0f)
                close()
                moveTo(168.56f, 203.06f)
                arcTo(131.17f, 131.17f, 0.0f, false, true, 128.0f, 225.72f)
                arcToRelative(130.94f, 130.94f, 0.0f, false, true, -40.56f, -22.66f)
                arcToRelative(113.09f, 113.09f, 0.0f, false, true, -25.56f, -29.45f)
                lineTo(128.0f, 127.32f)
                lineToRelative(66.12f, 46.29f)
                arcTo(113.09f, 113.09f, 0.0f, false, true, 168.56f, 203.06f)
                close()
                moveTo(210.0f, 112.0f)
                curveToRelative(0.0f, 18.75f, -3.44f, 35.75f, -10.28f, 50.88f)
                lineToRelative(-68.28f, -47.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.88f, 0.0f)
                lineToRelative(-68.28f, 47.8f)
                curveTo(49.44f, 147.75f, 46.0f, 130.75f, 46.0f, 112.0f)
                verticalLineTo(56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineTo(208.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _shieldchevron!!
    }

private var _shieldchevron: ImageVector? = null
