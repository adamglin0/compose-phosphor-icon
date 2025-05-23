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

public val FillGroup.LockSimpleOpen: ImageVector
    get() {
        if (_lockSimpleOpen != null) {
            return _lockSimpleOpen!!
        }
        _lockSimpleOpen = Builder(name = "LockSimpleOpen", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 96.0f)
                verticalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                horizontalLineTo(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                verticalLineTo(96.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 80.0f)
                horizontalLineTo(80.0f)
                verticalLineTo(56.0f)
                arcTo(48.05f, 48.05f, 0.0f, false, true, 128.0f, 8.0f)
                curveToRelative(23.2f, 0.0f, 43.32f, 16.15f, 47.84f, 38.41f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -15.68f, 3.18f)
                curveTo(157.2f, 35.0f, 143.37f, 24.0f, 128.0f, 24.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 96.0f, 56.0f)
                verticalLineTo(80.0f)
                horizontalLineTo(208.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 96.0f)
                close()
            }
        }
        .build()
        return _lockSimpleOpen!!
    }

private var _lockSimpleOpen: ImageVector? = null
