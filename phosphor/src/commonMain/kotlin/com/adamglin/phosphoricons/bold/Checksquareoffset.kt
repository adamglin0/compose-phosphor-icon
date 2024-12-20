package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.CheckSquareOffset: ImageVector
    get() {
        if (_checkSquareOffset != null) {
            return _checkSquareOffset!!
        }
        _checkSquareOffset = Builder(name = "CheckSquareOffset", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 48.0f)
                verticalLineTo(208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                horizontalLineTo(140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(64.0f)
                verticalLineTo(52.0f)
                horizontalLineTo(52.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                verticalLineTo(48.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 48.0f, 28.0f)
                horizontalLineTo(208.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 228.0f, 48.0f)
                close()
                moveTo(128.49f, 151.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f)
                lineTo(64.0f, 199.0f)
                lineTo(48.49f, 183.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -17.0f, 17.0f)
                lineToRelative(24.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 0.0f)
                lineToRelative(56.0f, -56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 128.49f, 151.51f)
                close()
            }
        }
        .build()
        return _checkSquareOffset!!
    }

private var _checkSquareOffset: ImageVector? = null
