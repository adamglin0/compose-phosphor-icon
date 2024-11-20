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

public val BoldGroup.Spade: ImageVector
    get() {
        if (_spade != null) {
            return _spade!!
        }
        _spade = Builder(name = "Spade", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(133.37f, 13.27f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.74f, 0.0f)
                curveTo(118.44f, 15.36f, 20.0f, 65.4f, 20.0f, 136.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, 69.51f, 59.25f)
                lineToRelative(-5.28f, 26.4f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 96.0f, 236.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.77f, -14.35f)
                lineToRelative(-5.28f, -26.4f)
                arcTo(60.0f, 60.0f, 0.0f, false, false, 236.0f, 136.0f)
                curveTo(236.0f, 65.4f, 137.56f, 15.36f, 133.37f, 13.27f)
                close()
                moveTo(176.0f, 172.0f)
                arcToRelative(35.88f, 35.88f, 0.0f, false, true, -19.09f, -5.47f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -18.14f, 12.52f)
                lineTo(145.36f, 212.0f)
                horizontalLineTo(110.64f)
                lineToRelative(6.59f, -32.95f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -18.14f, -12.52f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 44.0f, 136.0f)
                curveToRelative(0.0f, -28.29f, 23.57f, -53.95f, 43.34f, -70.49f)
                arcTo(274.68f, 274.68f, 0.0f, false, true, 128.0f, 37.63f)
                arcToRelative(274.16f, 274.16f, 0.0f, false, true, 40.66f, 27.88f)
                curveTo(188.43f, 82.05f, 212.0f, 107.71f, 212.0f, 136.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 176.0f, 172.0f)
                close()
            }
        }
        .build()
        return _spade!!
    }

private var _spade: ImageVector? = null
