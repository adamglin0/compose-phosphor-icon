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

public val FillGroup.Bookuser: ImageVector
    get() {
        if (_bookuser != null) {
            return _bookuser!!
        }
        _bookuser = Builder(name = "Bookuser", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 80.0f)
                verticalLineTo(200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(160.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -24.0f, 23.94f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -5.12f, 7.55f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 120.0f, 232.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -24.0f, -24.0f)
                horizontalLineTo(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(88.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, 32.0f)
                verticalLineToRelative(63.73f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, false, 7.47f, 8.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.53f, -8.0f)
                verticalLineTo(104.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, -32.0f)
                horizontalLineToRelative(64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 240.0f, 80.0f)
                close()
                moveTo(88.81f, 56.0f)
                horizontalLineTo(89.0f)
                arcToRelative(47.92f, 47.92f, 0.0f, false, true, 36.0f, 17.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.08f, 0.0f)
                arcTo(47.92f, 47.92f, 0.0f, false, true, 167.0f, 56.0f)
                horizontalLineToRelative(0.19f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.54f, -5.84f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -85.46f, 0.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 88.81f, 56.0f)
                close()
            }
        }
        .build()
        return _bookuser!!
    }

private var _bookuser: ImageVector? = null
