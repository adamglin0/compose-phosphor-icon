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

public val ThinGroup.Thermometersimple: ImageVector
    get() {
        if (_thermometersimple != null) {
            return _thermometersimple!!
        }
        _thermometersimple = Builder(name = "Thermometersimple", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(132.0f, 156.29f)
                lineTo(132.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(68.29f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, 8.0f, 0.0f)
                close()
                moveTo(128.0f, 204.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 128.0f, 204.0f)
                close()
                moveTo(164.0f, 136.0f)
                lineTo(164.0f, 48.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -72.0f, 0.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, true, false, 72.0f, 0.0f)
                close()
                moveTo(128.0f, 236.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, -29.71f, -94.68f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 100.0f, 138.0f)
                lineTo(100.0f, 48.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 56.0f, 0.0f)
                verticalLineToRelative(90.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.71f, 3.28f)
                arcTo(52.0f, 52.0f, 0.0f, false, true, 128.0f, 236.0f)
                close()
            }
        }
        .build()
        return _thermometersimple!!
    }

private var _thermometersimple: ImageVector? = null
