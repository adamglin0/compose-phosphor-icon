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

public val BoldGroup.Wheelchair: ImageVector
    get() {
        if (_wheelchair != null) {
            return _wheelchair!!
        }
        _wheelchair = Builder(name = "Wheelchair", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(255.14f, 187.54f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -15.6f, -6.68f)
                lineToRelative(-9.75f, 3.9f)
                lineToRelative(-27.06f, -54.13f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 192.0f, 124.0f)
                horizontalLineTo(116.0f)
                verticalLineTo(108.0f)
                horizontalLineToRelative(52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                horizontalLineTo(116.0f)
                verticalLineTo(77.81f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, false, -24.0f, 0.0f)
                verticalLineToRelative(8.88f)
                arcToRelative(76.0f, 76.0f, 0.0f, true, false, 88.35f, 106.57f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -21.57f, -10.52f)
                arcTo(52.0f, 52.0f, 0.0f, true, true, 92.0f, 112.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(80.58f)
                lineToRelative(28.68f, 57.37f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 15.19f, 5.77f)
                lineToRelative(20.0f, -8.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 255.14f, 187.54f)
                close()
                moveTo(104.0f, 36.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, true, 94.0f, 46.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 104.0f, 36.0f)
                close()
            }
        }
        .build()
        return _wheelchair!!
    }

private var _wheelchair: ImageVector? = null
