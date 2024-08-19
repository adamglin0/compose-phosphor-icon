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

public val FillGroup.Cactus: ImageVector
    get() {
        if (_cactus != null) {
            return _cactus!!
        }
        _cactus = Builder(name = "Cactus", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineTo(88.0f)
                verticalLineTo(136.0f)
                horizontalLineTo(80.0f)
                arcTo(64.07f, 64.07f, 0.0f, false, true, 16.0f, 72.0f)
                arcTo(24.07f, 24.07f, 0.0f, false, true, 40.08f, 48.0f)
                horizontalLineToRelative(0.4f)
                arcTo(23.55f, 23.55f, 0.0f, false, true, 64.0f, 71.52f)
                verticalLineTo(72.0f)
                horizontalLineToRelative(0.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 80.0f, 88.0f)
                horizontalLineToRelative(8.0f)
                verticalLineTo(56.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 80.0f, 0.0f)
                verticalLineToRelative(72.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(-0.48f)
                arcTo(23.55f, 23.55f, 0.0f, false, true, 215.52f, 88.0f)
                horizontalLineToRelative(0.4f)
                arcTo(24.07f, 24.07f, 0.0f, false, true, 240.0f, 112.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, true, -64.0f, 64.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 216.0f)
                close()
            }
        }
        .build()
        return _cactus!!
    }

private var _cactus: ImageVector? = null
