package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.FileJpg: ImageVector
    get() {
        if (_fileJpg != null) {
            return _fileJpg!!
        }
        _fileJpg = Builder(name = "FileJpg", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.0f, 146.0f)
                lineTo(104.0f, 146.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(110.0f, 198.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, 0.0f, -52.0f)
                close()
                moveTo(120.0f, 186.0f)
                lineTo(110.0f, 186.0f)
                lineTo(110.0f, 158.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 0.0f, 28.0f)
                close()
                moveTo(214.0f, 184.0f)
                verticalLineToRelative(16.87f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -1.67f, 4.15f)
                arcTo(28.06f, 28.06f, 0.0f, false, true, 192.0f, 214.0f)
                curveToRelative(-16.54f, 0.0f, -30.0f, -15.25f, -30.0f, -34.0f)
                reflectiveCurveToRelative(13.46f, -34.0f, 30.0f, -34.0f)
                arcToRelative(27.43f, 27.43f, 0.0f, false, true, 15.36f, 4.77f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.72f, 9.95f)
                arcTo(15.25f, 15.25f, 0.0f, false, false, 192.0f, 158.0f)
                curveToRelative(-9.93f, 0.0f, -18.0f, 9.87f, -18.0f, 22.0f)
                reflectiveCurveToRelative(8.07f, 22.0f, 18.0f, 22.0f)
                arcToRelative(15.75f, 15.75f, 0.0f, false, false, 10.0f, -3.73f)
                lineTo(202.0f, 190.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(8.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 214.0f, 184.0f)
                close()
                moveTo(78.0f, 152.0f)
                verticalLineToRelative(38.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -48.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(66.0f, 152.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
                moveTo(212.24f, 83.76f)
                lineToRelative(-56.0f, -56.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 152.0f, 26.0f)
                lineTo(56.0f, 26.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 42.0f, 40.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(54.0f, 40.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(90.0f)
                lineTo(146.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(50.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(214.0f, 88.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 212.24f, 83.76f)
                close()
                moveTo(158.0f, 82.0f)
                lineTo(158.0f, 46.48f)
                lineTo(193.52f, 82.0f)
                close()
            }
        }
        .build()
        return _fileJpg!!
    }

private var _fileJpg: ImageVector? = null
