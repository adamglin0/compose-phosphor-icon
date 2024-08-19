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

public val ThinGroup.Sticker: ImageVector
    get() {
        if (_sticker != null) {
            return _sticker!!
        }
        _sticker = Builder(name = "Sticker", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 36.0f)
                lineTo(88.0f, 36.0f)
                arcTo(52.06f, 52.06f, 0.0f, false, false, 36.0f, 88.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(52.06f, 52.06f, 0.0f, false, false, 52.0f, 52.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(3.83f, 3.83f, 0.0f, false, false, 1.26f, -0.21f)
                curveToRelative(25.46f, -8.48f, 74.05f, -57.07f, 82.53f, -82.53f)
                arcTo(3.83f, 3.83f, 0.0f, false, false, 220.0f, 136.0f)
                lineTo(220.0f, 88.0f)
                arcTo(52.06f, 52.06f, 0.0f, false, false, 168.0f, 36.0f)
                close()
                moveTo(44.0f, 168.0f)
                lineTo(44.0f, 88.0f)
                arcTo(44.05f, 44.05f, 0.0f, false, true, 88.0f, 44.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, true, 44.0f, 44.0f)
                verticalLineToRelative(44.0f)
                lineTo(184.0f, 132.0f)
                arcToRelative(52.06f, 52.06f, 0.0f, false, false, -52.0f, 52.0f)
                verticalLineToRelative(28.0f)
                lineTo(88.0f, 212.0f)
                arcTo(44.05f, 44.05f, 0.0f, false, true, 44.0f, 168.0f)
                close()
                moveTo(140.0f, 210.0f)
                lineTo(140.0f, 184.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, true, 44.0f, -44.0f)
                horizontalLineToRelative(26.0f)
                curveTo(198.9f, 162.23f, 162.23f, 198.9f, 140.0f, 210.0f)
                close()
            }
        }
        .build()
        return _sticker!!
    }

private var _sticker: ImageVector? = null
