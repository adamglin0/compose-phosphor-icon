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

public val ThinGroup.Stool: ImageVector
    get() {
        if (_stool != null) {
            return _stool!!
        }
        _stool = Builder(name = "Stool", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(196.0f, 64.0f)
                verticalLineTo(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                horizontalLineTo(72.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 60.0f, 40.0f)
                verticalLineTo(64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 72.0f, 76.0f)
                horizontalLineTo(83.32f)
                lineTo(60.05f, 223.38f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 63.38f, 228.0f)
                arcTo(4.46f, 4.46f, 0.0f, false, false, 64.0f, 228.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 68.0f, 224.62f)
                lineTo(76.26f, 172.0f)
                horizontalLineTo(179.74f)
                lineToRelative(8.31f, 52.62f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 192.0f, 228.0f)
                arcToRelative(4.46f, 4.46f, 0.0f, false, false, 0.63f, -0.05f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.33f, -4.57f)
                lineTo(172.68f, 76.0f)
                horizontalLineTo(184.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 196.0f, 64.0f)
                close()
                moveTo(68.0f, 64.0f)
                verticalLineTo(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineTo(184.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineTo(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineTo(72.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 68.0f, 64.0f)
                close()
                moveTo(178.48f, 164.0f)
                horizontalLineToRelative(-101.0f)
                lineToRelative(13.9f, -88.0f)
                horizontalLineToRelative(73.16f)
                close()
            }
        }
        .build()
        return _stool!!
    }

private var _stool: ImageVector? = null
