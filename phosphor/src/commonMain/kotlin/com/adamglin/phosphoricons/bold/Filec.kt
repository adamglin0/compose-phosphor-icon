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

public val BoldGroup.Filec: ImageVector
    get() {
        if (_filec != null) {
            return _filec!!
        }
        _filec = Builder(name = "Filec", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.49f, 79.51f)
                lineToRelative(-56.0f, -56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 152.0f, 20.0f)
                horizontalLineTo(56.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 36.0f, 40.0f)
                verticalLineToRelative(68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(44.0f)
                horizontalLineToRelative(76.0f)
                verticalLineTo(92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(48.0f)
                verticalLineTo(212.0f)
                horizontalLineTo(124.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(76.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineTo(88.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.49f, 79.51f)
                close()
                moveTo(160.0f, 57.0f)
                lineToRelative(23.0f, 23.0f)
                horizontalLineTo(160.0f)
                close()
                moveTo(48.0f, 180.0f)
                curveToRelative(0.0f, 8.67f, 5.5f, 16.0f, 12.0f, 16.0f)
                arcToRelative(10.27f, 10.27f, 0.0f, false, false, 7.33f, -3.43f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 17.34f, 16.6f)
                arcTo(34.0f, 34.0f, 0.0f, false, true, 60.0f, 220.0f)
                curveToRelative(-19.85f, 0.0f, -36.0f, -17.94f, -36.0f, -40.0f)
                reflectiveCurveToRelative(16.15f, -40.0f, 36.0f, -40.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, 24.67f, 10.83f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -17.34f, 16.6f)
                arcTo(10.27f, 10.27f, 0.0f, false, false, 60.0f, 164.0f)
                curveTo(53.5f, 164.0f, 48.0f, 171.33f, 48.0f, 180.0f)
                close()
            }
        }
        .build()
        return _filec!!
    }

private var _filec: ImageVector? = null
