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

public val LightGroup.Placeholder: ImageVector
    get() {
        if (_placeholder != null) {
            return _placeholder!!
        }
        _placeholder = Builder(name = "Placeholder", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 34.0f)
                lineTo(48.0f, 34.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 34.0f, 48.0f)
                lineTo(34.0f, 208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(208.0f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(222.0f, 48.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 208.0f, 34.0f)
                close()
                moveTo(210.0f, 48.0f)
                lineTo(210.0f, 201.52f)
                lineTo(54.49f, 46.0f)
                lineTo(208.0f, 46.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 210.0f, 48.0f)
                close()
                moveTo(46.0f, 208.0f)
                lineTo(46.0f, 54.48f)
                lineTo(201.51f, 210.0f)
                lineTo(48.0f, 210.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 46.0f, 208.0f)
                close()
            }
        }
        .build()
        return _placeholder!!
    }

private var _placeholder: ImageVector? = null
