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

public val LightGroup.WarningOctagon: ImageVector
    get() {
        if (_warningOctagon != null) {
            return _warningOctagon!!
        }
        _warningOctagon = Builder(name = "WarningOctagon", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(122.0f, 136.0f)
                lineTo(122.0f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                close()
                moveTo(230.0f, 91.55f)
                verticalLineToRelative(72.9f)
                arcToRelative(13.92f, 13.92f, 0.0f, false, true, -4.1f, 9.9f)
                lineTo(174.35f, 225.9f)
                arcToRelative(13.92f, 13.92f, 0.0f, false, true, -9.9f, 4.1f)
                lineTo(91.55f, 230.0f)
                arcToRelative(13.92f, 13.92f, 0.0f, false, true, -9.9f, -4.1f)
                lineTo(30.1f, 174.35f)
                arcToRelative(13.92f, 13.92f, 0.0f, false, true, -4.1f, -9.9f)
                lineTo(26.0f, 91.55f)
                arcToRelative(13.92f, 13.92f, 0.0f, false, true, 4.1f, -9.9f)
                lineTo(81.65f, 30.1f)
                arcToRelative(13.92f, 13.92f, 0.0f, false, true, 9.9f, -4.1f)
                horizontalLineToRelative(72.9f)
                arcToRelative(13.92f, 13.92f, 0.0f, false, true, 9.9f, 4.1f)
                lineTo(225.9f, 81.65f)
                arcTo(13.92f, 13.92f, 0.0f, false, true, 230.0f, 91.55f)
                close()
                moveTo(218.0f, 91.55f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.59f, -1.42f)
                lineTo(165.87f, 38.59f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.42f, -0.59f)
                lineTo(91.55f, 38.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.41f, 0.59f)
                lineTo(38.58f, 90.13f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 38.0f, 91.55f)
                verticalLineToRelative(72.9f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.59f, 1.42f)
                lineToRelative(51.54f, 51.54f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.42f, 0.59f)
                horizontalLineToRelative(72.9f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.41f, -0.59f)
                lineToRelative(51.56f, -51.54f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.58f, -1.42f)
                close()
                moveTo(128.0f, 162.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 128.0f, 162.0f)
                close()
            }
        }
        .build()
        return _warningOctagon!!
    }

private var _warningOctagon: ImageVector? = null
