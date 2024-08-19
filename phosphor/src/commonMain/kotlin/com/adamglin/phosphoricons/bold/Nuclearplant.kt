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

public val BoldGroup.Nuclearplant: ImageVector
    get() {
        if (_nuclearplant != null) {
            return _nuclearplant!!
        }
        _nuclearplant = Builder(name = "Nuclearplant", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(92.83f, 50.0f)
                arcTo(59.79f, 59.79f, 0.0f, false, true, 152.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                arcToRelative(35.85f, 35.85f, 0.0f, false, false, -35.5f, 30.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -11.82f, 10.0f)
                arcToRelative(11.33f, 11.33f, 0.0f, false, true, -2.0f, -0.17f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 92.83f, 50.0f)
                close()
                moveTo(148.0f, 40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(52.06f, 52.06f, 0.0f, false, false, 52.0f, -52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -28.0f, 28.0f)
                close()
                moveTo(252.0f, 216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                horizontalLineTo(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineTo(32.15f)
                curveToRelative(12.47f, -26.53f, 26.2f, -64.41f, 27.72f, -104.81f)
                arcTo(19.89f, 19.89f, 0.0f, false, true, 79.85f, 80.0f)
                horizontalLineToRelative(88.34f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, 19.08f)
                curveToRelative(2.0f, 44.12f, 22.46f, 86.48f, 32.58f, 104.92f)
                horizontalLineTo(240.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 252.0f, 216.0f)
                close()
                moveTo(164.4f, 104.0f)
                horizontalLineToRelative(-16.0f)
                curveToRelative(2.36f, 38.59f, 15.49f, 74.53f, 27.47f, 100.0f)
                horizontalLineToRelative(17.78f)
                curveTo(181.92f, 180.52f, 167.0f, 143.66f, 164.4f, 104.0f)
                close()
                moveTo(58.48f, 204.0f)
                horizontalLineToRelative(91.0f)
                curveToRelative(-11.66f, -26.88f, -23.11f, -62.15f, -25.19f, -100.0f)
                horizontalLineTo(83.67f)
                curveTo(81.59f, 141.85f, 70.14f, 177.12f, 58.48f, 204.0f)
                close()
            }
        }
        .build()
        return _nuclearplant!!
    }

private var _nuclearplant: ImageVector? = null
