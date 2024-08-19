package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Numbersquarenine: ImageVector
    get() {
        if (_numbersquarenine != null) {
            return _numbersquarenine!!
        }
        _numbersquarenine = Builder(name = "Numbersquarenine", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 32.0f)
                lineTo(48.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 48.0f)
                lineTo(32.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(208.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(224.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 32.0f)
                close()
                moveTo(208.0f, 208.0f)
                lineTo(48.0f, 208.0f)
                lineTo(48.0f, 48.0f)
                lineTo(208.0f, 48.0f)
                lineTo(208.0f, 208.0f)
                close()
                moveTo(146.0f, 76.82f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 127.94f, 144.0f)
                quadToRelative(0.94f, 0.0f, 1.89f, -0.06f)
                lineToRelative(-16.7f, 28.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.77f, 11.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.0f, -2.77f)
                lineToRelative(32.24f, -54.0f)
                lineToRelative(0.07f, -0.1f)
                horizontalLineToRelative(0.0f)
                arcTo(36.05f, 36.05f, 0.0f, false, false, 146.0f, 76.82f)
                close()
                moveTo(145.33f, 118.0f)
                lineToRelative(0.0f, 0.0f)
                arcTo(20.0f, 20.0f, 0.0f, true, true, 138.0f, 90.68f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 145.31f, 118.0f)
                close()
            }
        }
        .build()
        return _numbersquarenine!!
    }

private var _numbersquarenine: ImageVector? = null
