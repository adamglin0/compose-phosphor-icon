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

public val FillGroup.Perspective: ImageVector
    get() {
        if (_perspective != null) {
            return _perspective!!
        }
        _perspective = Builder(name = "Perspective", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(224.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                arcToRelative(16.47f, 16.47f, 0.0f, false, true, -2.87f, -0.26f)
                lineToRelative(-160.0f, -29.09f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 32.0f, 178.91f)
                verticalLineTo(144.0f)
                horizontalLineTo(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineTo(240.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 248.0f, 136.0f)
                close()
                moveTo(36.0f, 112.0f)
                horizontalLineTo(220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                verticalLineTo(48.42f)
                arcToRelative(16.48f, 16.48f, 0.0f, false, false, -4.07f, -11.08f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -14.79f, -5.08f)
                lineToRelative(-160.0f, 29.09f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 77.09f)
                verticalLineTo(108.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 36.0f, 112.0f)
                close()
            }
        }
        .build()
        return _perspective!!
    }

private var _perspective: ImageVector? = null
