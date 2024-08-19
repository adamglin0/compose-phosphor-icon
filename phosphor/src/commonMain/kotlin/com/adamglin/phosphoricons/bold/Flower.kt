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

public val BoldGroup.Flower: ImageVector
    get() {
        if (_flower != null) {
            return _flower!!
        }
        _flower = Builder(name = "Flower", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(215.64f, 128.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, -43.82f, -75.9f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, -87.64f, 0.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 40.36f, 128.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 43.82f, 75.89f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 87.64f, 0.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 215.64f, 128.0f)
                close()
                moveTo(108.0f, 128.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 108.0f, 128.0f)
                close()
                moveTo(180.35f, 74.68f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, 34.64f)
                curveToRelative(-2.65f, 1.53f, -10.52f, 4.88f, -30.1f, 6.42f)
                arcToRelative(44.08f, 44.08f, 0.0f, false, false, -10.52f, -18.18f)
                curveTo(170.86f, 81.36f, 177.7f, 76.21f, 180.35f, 74.68f)
                close()
                moveTo(128.0f, 36.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, 20.0f)
                curveToRelative(0.0f, 3.06f, -1.0f, 11.55f, -9.49f, 29.28f)
                arcToRelative(43.79f, 43.79f, 0.0f, false, false, -21.0f, 0.0f)
                curveTo(109.0f, 67.55f, 108.0f, 59.06f, 108.0f, 56.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 128.0f, 36.0f)
                close()
                moveTo(48.33f, 82.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 27.32f, -7.32f)
                curveToRelative(2.65f, 1.53f, 9.49f, 6.68f, 20.62f, 22.88f)
                arcToRelative(44.08f, 44.08f, 0.0f, false, false, -10.52f, 18.18f)
                curveToRelative(-19.58f, -1.54f, -27.45f, -4.89f, -30.1f, -6.42f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 48.33f, 82.0f)
                close()
                moveTo(75.65f, 181.32f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, -34.64f)
                curveToRelative(2.65f, -1.53f, 10.52f, -4.88f, 30.1f, -6.42f)
                arcToRelative(44.08f, 44.08f, 0.0f, false, false, 10.52f, 18.18f)
                curveTo(85.14f, 174.64f, 78.3f, 179.79f, 75.65f, 181.32f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                curveToRelative(0.0f, -3.06f, 1.0f, -11.55f, 9.49f, -29.28f)
                arcToRelative(43.79f, 43.79f, 0.0f, false, false, 21.0f, 0.0f)
                curveTo(147.0f, 188.45f, 148.0f, 196.94f, 148.0f, 200.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 128.0f, 220.0f)
                close()
                moveTo(207.67f, 174.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -27.32f, 7.32f)
                curveToRelative(-2.65f, -1.53f, -9.49f, -6.68f, -20.62f, -22.88f)
                arcToRelative(44.08f, 44.08f, 0.0f, false, false, 10.52f, -18.18f)
                curveToRelative(19.58f, 1.54f, 27.45f, 4.89f, 30.1f, 6.42f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 207.67f, 174.0f)
                close()
            }
        }
        .build()
        return _flower!!
    }

private var _flower: ImageVector? = null
