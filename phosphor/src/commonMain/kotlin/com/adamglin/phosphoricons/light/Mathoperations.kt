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

public val LightGroup.Mathoperations: ImageVector
    get() {
        if (_mathoperations != null) {
            return _mathoperations!!
        }
        _mathoperations = Builder(name = "Mathoperations", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(110.0f, 72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(40.0f, 78.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(64.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 110.0f, 72.0f)
                close()
                moveTo(104.0f, 178.0f)
                lineTo(78.0f, 178.0f)
                lineTo(78.0f, 152.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(26.0f)
                lineTo(40.0f, 178.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(66.0f, 190.0f)
                verticalLineToRelative(26.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(78.0f, 190.0f)
                horizontalLineToRelative(26.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(152.0f, 174.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(152.0f, 162.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                close()
                moveTo(216.0f, 194.0f)
                lineTo(152.0f, 194.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(155.76f, 100.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, 0.0f)
                lineTo(184.0f, 80.49f)
                lineToRelative(19.76f, 19.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, -8.48f)
                lineTo(192.49f, 72.0f)
                lineToRelative(19.75f, -19.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, -8.48f)
                lineTo(184.0f, 63.51f)
                lineTo(164.24f, 43.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 8.48f)
                lineTo(175.51f, 72.0f)
                lineTo(155.76f, 91.76f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 155.76f, 100.24f)
                close()
            }
        }
        .build()
        return _mathoperations!!
    }

private var _mathoperations: ImageVector? = null
