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

public val BoldGroup.Numbersquarenine: ImageVector
    get() {
        if (_numbersquarenine != null) {
            return _numbersquarenine!!
        }
        _numbersquarenine = Builder(name = "Numbersquarenine", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 28.0f)
                lineTo(48.0f, 28.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 28.0f, 48.0f)
                lineTo(28.0f, 208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(208.0f, 228.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(228.0f, 48.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 208.0f, 28.0f)
                close()
                moveTo(204.0f, 204.0f)
                lineTo(52.0f, 204.0f)
                lineTo(52.0f, 52.0f)
                lineTo(204.0f, 52.0f)
                close()
                moveTo(108.0f, 142.64f)
                arcToRelative(39.81f, 39.81f, 0.0f, false, false, 14.94f, 5.0f)
                lineTo(109.7f, 169.85f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 20.6f, 12.3f)
                lineTo(162.64f, 128.0f)
                arcTo(40.0f, 40.0f, 0.0f, true, false, 108.0f, 142.64f)
                close()
                moveTo(114.14f, 100.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 27.72f, 16.0f)
                lineToRelative(0.0f, 0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -27.7f, -16.0f)
                close()
            }
        }
        .build()
        return _numbersquarenine!!
    }

private var _numbersquarenine: ImageVector? = null
