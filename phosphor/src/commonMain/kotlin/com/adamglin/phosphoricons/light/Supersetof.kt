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

public val LightGroup.Supersetof: ImageVector
    get() {
        if (_supersetof != null) {
            return _supersetof!!
        }
        _supersetof = Builder(name = "Supersetof", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(214.0f, 200.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(56.0f, 206.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(208.0f, 194.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 214.0f, 200.0f)
                close()
                moveTo(152.0f, 154.0f)
                lineTo(56.0f, 154.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(62.0f, 62.0f, 0.0f, false, false, 0.0f, -124.0f)
                lineTo(56.0f, 42.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(50.0f, 50.0f, 0.0f, false, true, 0.0f, 100.0f)
                close()
            }
        }
        .build()
        return _supersetof!!
    }

private var _supersetof: ImageVector? = null
