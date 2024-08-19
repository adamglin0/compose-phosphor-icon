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

public val ThinGroup.Squaresplitvertical: ImageVector
    get() {
        if (_squaresplitvertical != null) {
            return _squaresplitvertical!!
        }
        _squaresplitvertical = Builder(name = "Squaresplitvertical", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 44.0f)
                horizontalLineTo(56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 44.0f, 56.0f)
                verticalLineTo(200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineTo(200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                verticalLineTo(56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 200.0f, 44.0f)
                close()
                moveTo(56.0f, 52.0f)
                horizontalLineTo(200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(68.0f)
                horizontalLineTo(52.0f)
                verticalLineTo(56.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 56.0f, 52.0f)
                close()
                moveTo(200.0f, 204.0f)
                horizontalLineTo(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                verticalLineTo(132.0f)
                horizontalLineTo(204.0f)
                verticalLineToRelative(68.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 200.0f, 204.0f)
                close()
            }
        }
        .build()
        return _squaresplitvertical!!
    }

private var _squaresplitvertical: ImageVector? = null
