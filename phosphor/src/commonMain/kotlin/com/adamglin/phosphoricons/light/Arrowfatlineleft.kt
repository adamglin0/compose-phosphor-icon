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

public val LightGroup.ArrowFatLineLeft: ImageVector
    get() {
        if (_arrowFatLineLeft != null) {
            return _arrowFatLineLeft!!
        }
        _arrowFatLineLeft = Builder(name = "ArrowFatLineLeft", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 74.0f)
                lineTo(126.0f, 74.0f)
                lineTo(126.0f, 32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.24f, -4.24f)
                lineToRelative(-96.0f, 96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 8.48f)
                lineToRelative(96.0f, 96.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 126.0f, 224.0f)
                lineTo(126.0f, 182.0f)
                horizontalLineToRelative(58.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(190.0f, 80.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 184.0f, 74.0f)
                close()
                moveTo(178.0f, 170.0f)
                lineTo(120.0f, 170.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(33.51f)
                lineTo(32.49f, 128.0f)
                lineTo(114.0f, 46.49f)
                lineTo(114.0f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(58.0f)
                close()
                moveTo(222.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(210.0f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
            }
        }
        .build()
        return _arrowFatLineLeft!!
    }

private var _arrowFatLineLeft: ImageVector? = null
