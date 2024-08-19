package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Bandaids: ImageVector
    get() {
        if (_bandaids != null) {
            return _bandaids!!
        }
        _bandaids = Builder(name = "Bandaids", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.57f, 128.0f)
                lineToRelative(27.71f, -27.72f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -56.56f, -56.56f)
                lineTo(128.0f, 71.43f)
                lineTo(100.28f, 43.72f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -56.56f, 56.56f)
                lineTo(71.43f, 128.0f)
                lineTo(43.72f, 155.72f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 56.56f, 56.56f)
                lineTo(128.0f, 184.57f)
                lineToRelative(27.72f, 27.71f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 56.56f, -56.56f)
                close()
                moveTo(167.0f, 55.0f)
                arcTo(24.0f, 24.0f, 0.0f, true, true, 201.0f, 89.0f)
                lineToRelative(-27.72f, 27.72f)
                lineTo(139.31f, 82.75f)
                close()
                moveTo(161.91f, 128.0f)
                lineTo(128.0f, 161.94f)
                lineTo(94.06f, 128.0f)
                lineTo(128.0f, 94.06f)
                close()
                moveTo(55.0f, 89.0f)
                horizontalLineToRelative(0.0f)
                arcTo(24.0f, 24.0f, 0.0f, true, true, 89.0f, 55.0f)
                lineToRelative(27.72f, 27.72f)
                lineTo(82.75f, 116.69f)
                close()
                moveTo(89.0f, 201.0f)
                arcTo(24.0f, 24.0f, 0.0f, true, true, 55.0f, 167.0f)
                lineToRelative(27.72f, -27.72f)
                lineToRelative(33.94f, 33.94f)
                close()
                moveTo(201.0f, 201.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 167.0f, 201.0f)
                lineToRelative(-27.72f, -27.72f)
                lineToRelative(33.94f, -33.94f)
                lineTo(201.0f, 167.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 201.0f, 201.0f)
                close()
                moveTo(116.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 116.0f, 128.0f)
                close()
            }
        }
        .build()
        return _bandaids!!
    }

private var _bandaids: ImageVector? = null
