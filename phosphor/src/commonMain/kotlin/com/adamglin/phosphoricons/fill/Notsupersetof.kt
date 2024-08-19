package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Notsupersetof: ImageVector
    get() {
        if (_notsupersetof != null) {
            return _notsupersetof!!
        }
        _notsupersetof = Builder(name = "Notsupersetof", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.09f, 98.9f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 144.0f, 136.0f)
                horizontalLineTo(131.63f)
                close()
                moveTo(224.0f, 48.0f)
                verticalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                horizontalLineTo(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                verticalLineTo(48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 32.0f)
                horizontalLineTo(208.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 48.0f)
                close()
                moveTo(189.27f, 58.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.29f, 0.75f)
                lineTo(162.42f, 76.51f)
                arcTo(39.82f, 39.82f, 0.0f, false, false, 144.0f, 72.0f)
                horizontalLineTo(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(23.87f, 23.87f, 0.0f, false, true, 7.36f, 1.16f)
                lineToRelative(-41.0f, 46.84f)
                horizontalLineTo(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineTo(96.37f)
                lineTo(66.0f, 186.73f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 12.0f, 10.54f)
                lineTo(89.63f, 184.0f)
                horizontalLineTo(176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                horizontalLineTo(103.63f)
                lineToRelative(14.0f, -16.0f)
                horizontalLineTo(144.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 30.87f, -65.41f)
                lineTo(190.0f, 69.27f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 189.27f, 58.0f)
                close()
            }
        }
        .build()
        return _notsupersetof!!
    }

private var _notsupersetof: ImageVector? = null
