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

public val FillGroup.Eject: ImageVector
    get() {
        if (_eject != null) {
            return _eject!!
        }
        _eject = Builder(name = "Eject", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(33.31f, 126.24f)
                arcToRelative(15.59f, 15.59f, 0.0f, false, true, 3.1f, -17.12f)
                horizontalLineToRelative(0.0f)
                lineToRelative(73.73f, -77.51f)
                arcToRelative(24.76f, 24.76f, 0.0f, false, true, 35.72f, 0.0f)
                lineToRelative(73.73f, 77.51f)
                arcToRelative(15.59f, 15.59f, 0.0f, false, true, 3.1f, 17.12f)
                arcTo(16.18f, 16.18f, 0.0f, false, true, 207.76f, 136.0f)
                horizontalLineTo(48.24f)
                arcTo(16.18f, 16.18f, 0.0f, false, true, 33.31f, 126.24f)
                close()
                moveTo(208.0f, 152.0f)
                horizontalLineTo(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(168.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 152.0f)
                close()
            }
        }
        .build()
        return _eject!!
    }

private var _eject: ImageVector? = null
