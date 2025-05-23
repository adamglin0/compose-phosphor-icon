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

public val FillGroup.Lectern: ImageVector
    get() {
        if (_lectern != null) {
            return _lectern!!
        }
        _lectern = Builder(name = "Lectern", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.3f, 120.84f)
                lineToRelative(-40.0f, -80.0f)
                arcTo(15.92f, 15.92f, 0.0f, false, false, 192.0f, 32.0f)
                horizontalLineTo(64.0f)
                arcTo(15.92f, 15.92f, 0.0f, false, false, 49.7f, 40.84f)
                lineToRelative(-40.0f, 80.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 144.0f)
                horizontalLineToRelative(96.0f)
                verticalLineToRelative(64.0f)
                horizontalLineTo(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                horizontalLineTo(136.0f)
                verticalLineTo(144.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 14.31f, -23.16f)
                close()
                moveTo(192.0f, 120.0f)
                horizontalLineTo(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineTo(192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
            }
        }
        .build()
        return _lectern!!
    }

private var _lectern: ImageVector? = null
