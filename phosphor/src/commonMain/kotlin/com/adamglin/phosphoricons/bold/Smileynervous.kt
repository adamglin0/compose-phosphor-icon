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

public val BoldGroup.SmileyNervous: ImageVector
    get() {
        if (_smileyNervous != null) {
            return _smileyNervous!!
        }
        _smileyNervous = Builder(name = "SmileyNervous", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, true, 84.0f, -84.0f)
                arcTo(84.09f, 84.09f, 0.0f, false, true, 128.0f, 212.0f)
                close()
                moveTo(76.0f, 108.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 76.0f, 108.0f)
                close()
                moveTo(148.0f, 108.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 148.0f, 108.0f)
                close()
                moveTo(178.92f, 172.94f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -16.78f, 2.52f)
                arcToRelative(38.18f, 38.18f, 0.0f, false, true, -7.74f, -8.26f)
                arcToRelative(35.12f, 35.12f, 0.0f, false, false, -2.4f, -3.0f)
                arcToRelative(35.12f, 35.12f, 0.0f, false, false, -2.4f, 3.0f)
                curveTo(146.0f, 172.0f, 140.0f, 180.0f, 128.0f, 180.0f)
                reflectiveCurveToRelative(-18.0f, -8.0f, -21.6f, -12.8f)
                arcToRelative(35.12f, 35.12f, 0.0f, false, false, -2.4f, -3.0f)
                arcToRelative(35.12f, 35.12f, 0.0f, false, false, -2.4f, 3.0f)
                arcToRelative(38.18f, 38.18f, 0.0f, false, true, -7.74f, 8.26f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -14.27f, -19.3f)
                arcToRelative(22.82f, 22.82f, 0.0f, false, false, 2.81f, -3.36f)
                curveTo(86.0f, 148.0f, 92.0f, 140.0f, 104.0f, 140.0f)
                reflectiveCurveToRelative(18.0f, 8.0f, 21.6f, 12.8f)
                arcToRelative(35.12f, 35.12f, 0.0f, false, false, 2.4f, 3.0f)
                arcToRelative(35.12f, 35.12f, 0.0f, false, false, 2.4f, -3.0f)
                curveTo(134.0f, 148.0f, 140.0f, 140.0f, 152.0f, 140.0f)
                reflectiveCurveToRelative(18.0f, 8.0f, 21.6f, 12.8f)
                arcToRelative(22.82f, 22.82f, 0.0f, false, false, 2.81f, 3.36f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 178.92f, 172.94f)
                close()
            }
        }
        .build()
        return _smileyNervous!!
    }

private var _smileyNervous: ImageVector? = null
