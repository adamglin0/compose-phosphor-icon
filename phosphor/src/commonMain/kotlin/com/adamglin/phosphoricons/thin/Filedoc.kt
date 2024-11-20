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

public val ThinGroup.FileDoc: ImageVector
    get() {
        if (_fileDoc != null) {
            return _fileDoc!!
        }
        _fileDoc = Builder(name = "FileDoc", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(52.0f, 148.0f)
                lineTo(36.0f, 148.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(52.0f, 212.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 0.0f, -64.0f)
                close()
                moveTo(52.0f, 204.0f)
                lineTo(40.0f, 204.0f)
                lineTo(40.0f, 156.0f)
                lineTo(52.0f, 156.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 0.0f, 48.0f)
                close()
                moveTo(218.77f, 198.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.12f, 5.66f)
                arcTo(26.11f, 26.11f, 0.0f, false, true, 200.0f, 212.0f)
                curveToRelative(-15.44f, 0.0f, -28.0f, -14.36f, -28.0f, -32.0f)
                reflectiveCurveToRelative(12.56f, -32.0f, 28.0f, -32.0f)
                arcToRelative(26.11f, 26.11f, 0.0f, false, true, 18.89f, 8.36f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -5.78f, 5.54f)
                arcTo(18.15f, 18.15f, 0.0f, false, false, 200.0f, 156.0f)
                curveToRelative(-11.0f, 0.0f, -20.0f, 10.77f, -20.0f, 24.0f)
                reflectiveCurveToRelative(9.0f, 24.0f, 20.0f, 24.0f)
                arcToRelative(18.15f, 18.15f, 0.0f, false, false, 13.11f, -5.9f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 218.77f, 198.0f)
                close()
                moveTo(128.0f, 148.0f)
                curveToRelative(-15.44f, 0.0f, -28.0f, 14.36f, -28.0f, 32.0f)
                reflectiveCurveToRelative(12.56f, 32.0f, 28.0f, 32.0f)
                reflectiveCurveToRelative(28.0f, -14.36f, 28.0f, -32.0f)
                reflectiveCurveTo(143.44f, 148.0f, 128.0f, 148.0f)
                close()
                moveTo(128.0f, 204.0f)
                curveToRelative(-11.0f, 0.0f, -20.0f, -10.77f, -20.0f, -24.0f)
                reflectiveCurveToRelative(9.0f, -24.0f, 20.0f, -24.0f)
                reflectiveCurveToRelative(20.0f, 10.77f, 20.0f, 24.0f)
                reflectiveCurveTo(139.0f, 204.0f, 128.0f, 204.0f)
                close()
                moveTo(48.0f, 116.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(52.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(92.0f)
                lineTo(148.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(52.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(212.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.17f, -2.83f)
                lineToRelative(-56.0f, -56.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 152.0f, 28.0f)
                lineTo(56.0f, 28.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 44.0f, 40.0f)
                verticalLineToRelative(72.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 48.0f, 116.0f)
                close()
                moveTo(156.0f, 41.65f)
                lineTo(198.34f, 84.0f)
                lineTo(156.0f, 84.0f)
                close()
            }
        }
        .build()
        return _fileDoc!!
    }

private var _fileDoc: ImageVector? = null
