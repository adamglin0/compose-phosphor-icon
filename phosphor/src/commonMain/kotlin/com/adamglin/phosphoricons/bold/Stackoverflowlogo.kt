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

public val BoldGroup.Stackoverflowlogo: ImageVector
    get() {
        if (_stackoverflowlogo != null) {
            return _stackoverflowlogo!!
        }
        _stackoverflowlogo = Builder(name = "Stackoverflowlogo", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.0f, 151.67f)
                verticalLineTo(216.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 208.0f, 228.0f)
                horizontalLineTo(48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 36.0f, 216.0f)
                verticalLineTo(151.67f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 24.0f, 0.0f)
                verticalLineTo(203.9f)
                horizontalLineTo(196.0f)
                verticalLineTo(151.67f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 24.0f, 0.0f)
                close()
                moveTo(88.0f, 183.81f)
                horizontalLineToRelative(80.0f)
                arcToRelative(12.06f, 12.06f, 0.0f, false, false, 0.0f, -24.11f)
                horizontalLineTo(88.0f)
                arcToRelative(12.06f, 12.06f, 0.0f, false, false, 0.0f, 24.11f)
                close()
                moveTo(96.2f, 113.0f)
                lineToRelative(75.17f, 27.49f)
                arcToRelative(12.05f, 12.05f, 0.0f, false, false, 8.21f, -22.66f)
                lineTo(104.41f, 90.35f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 96.2f, 113.0f)
                close()
                moveTo(128.0f, 49.29f)
                lineToRelative(61.29f, 51.64f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 16.9f, -1.48f)
                arcToRelative(12.09f, 12.09f, 0.0f, false, false, -1.48f, -17.0f)
                lineTo(143.44f, 30.82f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -16.91f, 1.49f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 128.0f, 49.29f)
                close()
            }
        }
        .build()
        return _stackoverflowlogo!!
    }

private var _stackoverflowlogo: ImageVector? = null
