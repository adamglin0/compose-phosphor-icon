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

public val FillGroup.Headset: ImageVector
    get() {
        if (_headset != null) {
            return _headset!!
        }
        _headset = Builder(name = "Headset", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 128.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -40.0f, 40.0f)
                horizontalLineTo(136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, -24.0f)
                horizontalLineTo(192.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, -24.0f)
                verticalLineTo(144.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 24.0f, -24.0f)
                horizontalLineToRelative(23.65f)
                arcTo(88.0f, 88.0f, 0.0f, false, false, 66.0f, 65.54f)
                arcTo(87.29f, 87.29f, 0.0f, false, false, 40.36f, 120.0f)
                horizontalLineTo(64.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 24.0f, 24.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, 24.0f)
                horizontalLineTo(48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, -24.0f)
                verticalLineTo(128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, true, 201.89f, 54.66f)
                arcTo(103.41f, 103.41f, 0.0f, false, true, 232.0f, 128.0f)
                close()
            }
        }
        .build()
        return _headset!!
    }

private var _headset: ImageVector? = null
