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

public val BoldGroup.Floppydiskback: ImageVector
    get() {
        if (_floppydiskback != null) {
            return _floppydiskback!!
        }
        _floppydiskback = Builder(name = "Floppydiskback", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 28.0f)
                lineTo(83.31f, 28.0f)
                arcToRelative(19.86f, 19.86f, 0.0f, false, false, -14.14f, 5.86f)
                lineTo(33.86f, 69.17f)
                arcTo(19.86f, 19.86f, 0.0f, false, false, 28.0f, 83.31f)
                lineTo(28.0f, 208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(208.0f, 228.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(228.0f, 48.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 208.0f, 28.0f)
                close()
                moveTo(92.0f, 52.0f)
                horizontalLineToRelative(72.0f)
                lineTo(164.0f, 72.0f)
                lineTo(92.0f, 72.0f)
                close()
                moveTo(204.0f, 204.0f)
                lineTo(52.0f, 204.0f)
                lineTo(52.0f, 85.0f)
                lineTo(68.0f, 69.0f)
                verticalLineToRelative(7.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 88.0f, 96.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(188.0f, 52.0f)
                horizontalLineToRelative(16.0f)
                close()
                moveTo(128.0f, 108.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, true, false, 42.0f, 42.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, false, 128.0f, 108.0f)
                close()
                moveTo(128.0f, 168.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 128.0f, 168.0f)
                close()
            }
        }
        .build()
        return _floppydiskback!!
    }

private var _floppydiskback: ImageVector? = null
